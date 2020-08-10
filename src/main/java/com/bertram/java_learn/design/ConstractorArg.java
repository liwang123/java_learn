package com.bertram.java_learn.design;

/**
 * @author wang
 * @date 2020/8/7 11:37
 */
public class ConstractorArg {
    private boolean isRef;
    private Class type;

    private Object arg;

    public ConstractorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConstractorArg{");
        sb.append("isRef=").append(this.isRef);
        sb.append(", type=").append(this.type);
        sb.append(", arg=").append(this.arg);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private boolean isRef;
        private Class type;

        private Object arg;

        public ConstractorArg build() {
            if (this.isRef) {
                if (this.arg instanceof String) {

                } else {
                    throw new RuntimeException("s");

                }
            } else {
                if (this.type == null || this.arg == null) {
                    throw new RuntimeException("error");
                }
            }
            return new ConstractorArg(this);
        }

        public Builder setIsRef(boolean isRef) {
            this.isRef = isRef;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }

    }
}
