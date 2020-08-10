package com.bertram.java_learn.design;

/**
 * @author wang
 * @date 2020/8/7 11:00
 */
public class ResourceConfig {
    private String name;

    private Integer maxTotal;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResourceConfig{");
        sb.append("name='").append(this.name).append('\'');
        sb.append(", maxTotal=").append(this.maxTotal);
        sb.append('}');
        return sb.toString();
    }

    public ResourceConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
    }

    public static class Builder {
        private String name;

        private Integer maxTotal;

        public ResourceConfig build() {
            return new ResourceConfig(this);
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(final Integer maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }
    }
}
