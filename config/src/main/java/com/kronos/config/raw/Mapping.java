package com.kronos.config.raw;

/**
 * @Author: jackila
 * @Date: 3:44 PM 2022-5-30
 */
public class Mapping {
    private String field;
    private String source;
    private Mapping mapping;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Mapping getMapping() {
        return mapping;
    }

    public void setMapping(Mapping mapping) {
        this.mapping = mapping;
    }
}
