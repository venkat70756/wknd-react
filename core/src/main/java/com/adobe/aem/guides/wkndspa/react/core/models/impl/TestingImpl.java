package com.adobe.aem.guides.wkndspa.react.core.models.impl;

import com.adobe.aem.guides.wkndspa.react.core.models.Testing;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.google.gson.annotations.Expose;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {Testing.class, ComponentExporter.class},
        resourceType = TestingImpl.RESOURCE_TYPE ,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name= ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
public class TestingImpl implements Testing {

    @ValueMapValue
    @Expose
    private String  label;

    @ValueMapValue
    @Expose
    private double lat;

    @ValueMapValue
    @Expose
    private double lon;

    static final String RESOURCE_TYPE = "wknd-spa-react/components/content/testing";

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public double getLat(){
        return lat;
    }

    @Override
    public double getLon() {
        return lon;
    }

    @Override
    public String getExportedType() {
        return TestingImpl.RESOURCE_TYPE;
    }
}
