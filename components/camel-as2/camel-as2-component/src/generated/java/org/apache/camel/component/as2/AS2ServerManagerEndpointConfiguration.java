
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.as2;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.as2.api.AS2ServerManager}.
 */
@ApiParams(apiName = "server", description = "Receives EDI Messages over HTTP",
           apiMethods = {@ApiMethod(methodName = "listen")})
@UriParams
@Configurer
public final class AS2ServerManagerEndpointConfiguration extends AS2Configuration {
    @UriParam
    @ApiParam(apiMethods = "listen")
    private String requestUriPattern;

    public String getRequestUriPattern() {
        return requestUriPattern;
    }

    public void setRequestUriPattern(String requestUriPattern) {
        this.requestUriPattern = requestUriPattern;
    }
}
