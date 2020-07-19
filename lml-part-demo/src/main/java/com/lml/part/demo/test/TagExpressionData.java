package com.lml.part.demo.test;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 订阅事件集合
 *
 * @author shuishan
 * @date 2020/4/10
 */
public class TagExpressionData implements Serializable {

    /**
     * topic
     */
    private String topic;

    /**
     * sub tags
     */
    private String tagExpression;

    /**
     * 通配符的tags
     */
    private Set<String> wildcardTags = new HashSet<String>();

    /**
     * tag
     */
    private Set<String> tags = new HashSet<String>();

    public TagExpressionData(String topic) {
        if (StringUtils.isBlank(topic)) {
            throw new IllegalArgumentException("tagExpressData topic not null!");
        }
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public String getTagExpression() {
        return tagExpression;
    }

    public void setTagExpression(String tagExpression) {
        if (StringUtils.isBlank(tagExpression)) {
            throw new IllegalArgumentException("tagExpression is not null!");
        }
        this.tagExpression = tagExpression;
        String[] tagArr = tagExpression.split("\\|\\|");
        if (tagArr.length == 0) {
            throw new IllegalArgumentException("tagExpression split error!");
        }
        tags = new HashSet<String>(tagArr.length);
        for (String tag : tagArr) {
            String trimTag = tag.trim();
            if (trimTag.contains("*") && !wildcardTags.contains(trimTag)) {
                wildcardTags.add(trimTag);
                continue;
            }
            tags.add(trimTag);
        }
    }

    /**
     * 是否匹配tag
     */
    public boolean matchTags(String tag) {
        if (tags.contains(tag)) {
            return true;
        }
        if (wildcardTags.size() == 0) {
            return false;
        }
        for (String wildcardTag : wildcardTags) {
            if (StringWildcard.wildMatch(wildcardTag, tag)) {
                tags.add(tag);
                return true;
            }
        }
        return false;
    }

    public Set<String> getWildcardTags() {
        return wildcardTags;
    }

    public Set<String> getTags() {
        return tags;
    }

}
