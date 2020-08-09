package com.mini.workshop.template.orchestratornlpentity;

import java.io.Serializable;
import java.util.Map;



public class NLPContext implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Map<String, Object> parameters;

    private Integer lifespan;

    public NLPContext() {
    }

    public NLPContext(final String name) {
        this.name = name;
    }

    /**
     * Context name
     */
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    /**
     * String parameters map
     */
    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(final Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    /**
     * Lifespan of the context measured in requests
     *
     * @return count of requests context will live
     */
    public Integer getLifespan() {
        return lifespan;
    }

    /**
     * Lifespan of the context measured in requests
     *
     * @param lifespan count of requests context will live
     */
    public void setLifespan(final Integer lifespan) {
        this.lifespan = lifespan;
    }
}
