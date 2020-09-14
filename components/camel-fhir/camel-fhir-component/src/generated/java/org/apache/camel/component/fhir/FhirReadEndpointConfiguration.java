
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirRead}.
 */
@ApiParams(apiName = "read", description = "API method for read operations",
           apiMethods = {@ApiMethod(methodName = "resourceById"), @ApiMethod(methodName = "resourceById"), @ApiMethod(methodName = "resourceById"), @ApiMethod(methodName = "resourceById"), @ApiMethod(methodName = "resourceById"), @ApiMethod(methodName = "resourceById"), @ApiMethod(methodName = "resourceByUrl"), @ApiMethod(methodName = "resourceByUrl"), @ApiMethod(methodName = "resourceByUrl"), @ApiMethod(methodName = "resourceByUrl")})
@UriParams
@Configurer
public final class FhirReadEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(apiMethods = "resourceById,resourceByUrl")
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;
    @UriParam
    @ApiParam(apiMethods = "resourceByUrl")
    private org.hl7.fhir.instance.model.api.IIdType iUrl;
    @UriParam
    @ApiParam(apiMethods = "resourceById")
    private org.hl7.fhir.instance.model.api.IIdType id;
    @UriParam
    @ApiParam(apiMethods = "resourceById,resourceByUrl")
    private String ifVersionMatches;
    @UriParam
    @ApiParam(apiMethods = "resourceById")
    private Long longId;
    @UriParam
    @ApiParam(apiMethods = "resourceById,resourceByUrl")
    private Class<org.hl7.fhir.instance.model.api.IBaseResource> resource;
    @UriParam
    @ApiParam(apiMethods = "resourceById,resourceByUrl")
    private String resourceClass;
    @UriParam
    @ApiParam(apiMethods = "resourceById,resourceByUrl")
    private Boolean returnNull;
    @UriParam
    @ApiParam(apiMethods = "resourceById,resourceByUrl")
    private org.hl7.fhir.instance.model.api.IBaseResource returnResource;
    @UriParam
    @ApiParam(apiMethods = "resourceById")
    private String stringId;
    @UriParam
    @ApiParam(apiMethods = "resourceById,resourceByUrl")
    private Boolean throwError;
    @UriParam
    @ApiParam(apiMethods = "resourceByUrl")
    private String url;
    @UriParam
    @ApiParam(apiMethods = "resourceById")
    private String version;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IIdType getIUrl() {
        return iUrl;
    }

    public void setIUrl(org.hl7.fhir.instance.model.api.IIdType iUrl) {
        this.iUrl = iUrl;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public String getIfVersionMatches() {
        return ifVersionMatches;
    }

    public void setIfVersionMatches(String ifVersionMatches) {
        this.ifVersionMatches = ifVersionMatches;
    }

    public Long getLongId() {
        return longId;
    }

    public void setLongId(Long longId) {
        this.longId = longId;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseResource> getResource() {
        return resource;
    }

    public void setResource(Class<org.hl7.fhir.instance.model.api.IBaseResource> resource) {
        this.resource = resource;
    }

    public String getResourceClass() {
        return resourceClass;
    }

    public void setResourceClass(String resourceClass) {
        this.resourceClass = resourceClass;
    }

    public Boolean getReturnNull() {
        return returnNull;
    }

    public void setReturnNull(Boolean returnNull) {
        this.returnNull = returnNull;
    }

    public org.hl7.fhir.instance.model.api.IBaseResource getReturnResource() {
        return returnResource;
    }

    public void setReturnResource(org.hl7.fhir.instance.model.api.IBaseResource returnResource) {
        this.returnResource = returnResource;
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    public Boolean getThrowError() {
        return throwError;
    }

    public void setThrowError(Boolean throwError) {
        this.throwError = throwError;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
