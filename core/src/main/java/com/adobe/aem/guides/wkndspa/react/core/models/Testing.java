package com.adobe.aem.guides.wkndspa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface Testing extends ComponentExporter {

    public String getLabel();

    public double getLat();

    public double getLon();
}
