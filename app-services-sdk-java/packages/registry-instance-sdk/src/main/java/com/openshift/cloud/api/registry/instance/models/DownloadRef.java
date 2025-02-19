/*
 * Apicurio Registry API [v2]
 * Apicurio Registry is a datastore for standard event schemas and API designs. Apicurio Registry enables developers to manage and share the structure of their data using a REST interface. For example, client applications can dynamically push or pull the latest updates to or from the registry without needing to redeploy. Apicurio Registry also enables developers to create rules that govern how registry content can evolve over time. For example, this includes rules for content validation and version compatibility.  The Apicurio Registry REST API enables client applications to manage the artifacts in the registry. This API provides create, read, update, and delete operations for schema and API artifacts, rules, versions, and metadata.   The supported artifact types include: - Apache Avro schema - AsyncAPI specification - Google protocol buffers - GraphQL schema - JSON Schema - Kafka Connect schema - OpenAPI specification - Web Services Description Language - XML Schema Definition   **Important**: The Apicurio Registry REST API is available from `https://MY-REGISTRY-URL/apis/registry/v2` by default. Therefore you must prefix all API operation paths with `../apis/registry/v2` in this case. For example: `../apis/registry/v2/ids/globalIds/{globalId}`. 
 *
 * The version of the OpenAPI document: 2.4.x
 * Contact: apicurio@lists.jboss.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.registry.instance.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Models a download \&quot;link\&quot;.  Useful for browser use-cases.
 */
@ApiModel(description = "Models a download \"link\".  Useful for browser use-cases.")
@JsonPropertyOrder({
  DownloadRef.JSON_PROPERTY_DOWNLOAD_ID,
  DownloadRef.JSON_PROPERTY_HREF
})
@JsonTypeName("DownloadRef")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DownloadRef {
  public static final String JSON_PROPERTY_DOWNLOAD_ID = "downloadId";
  private String downloadId;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public DownloadRef() { 
  }

  public DownloadRef downloadId(String downloadId) {
    
    this.downloadId = downloadId;
    return this;
  }

   /**
   * Get downloadId
   * @return downloadId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDownloadId() {
    return downloadId;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDownloadId(String downloadId) {
    this.downloadId = downloadId;
  }


  public DownloadRef href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadRef downloadRef = (DownloadRef) o;
    return Objects.equals(this.downloadId, downloadRef.downloadId) &&
        Objects.equals(this.href, downloadRef.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadId, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadRef {\n");
    sb.append("    downloadId: ").append(toIndentedString(downloadId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

