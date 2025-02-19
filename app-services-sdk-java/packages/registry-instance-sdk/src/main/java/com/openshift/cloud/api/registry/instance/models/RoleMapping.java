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
import com.openshift.cloud.api.registry.instance.models.RoleType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The mapping between a user/principal and their role.
 */
@ApiModel(description = "The mapping between a user/principal and their role.")
@JsonPropertyOrder({
  RoleMapping.JSON_PROPERTY_PRINCIPAL_ID,
  RoleMapping.JSON_PROPERTY_ROLE,
  RoleMapping.JSON_PROPERTY_PRINCIPAL_NAME
})
@JsonTypeName("RoleMapping")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleMapping {
  public static final String JSON_PROPERTY_PRINCIPAL_ID = "principalId";
  private String principalId;

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleType role;

  public static final String JSON_PROPERTY_PRINCIPAL_NAME = "principalName";
  private String principalName;

  public RoleMapping() { 
  }

  public RoleMapping principalId(String principalId) {
    
    this.principalId = principalId;
    return this;
  }

   /**
   * Get principalId
   * @return principalId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrincipalId() {
    return principalId;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }


  public RoleMapping role(RoleType role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleType getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(RoleType role) {
    this.role = role;
  }


  public RoleMapping principalName(String principalName) {
    
    this.principalName = principalName;
    return this;
  }

   /**
   * A friendly name for the principal.
   * @return principalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A friendly name for the principal.")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrincipalName() {
    return principalName;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMapping roleMapping = (RoleMapping) o;
    return Objects.equals(this.principalId, roleMapping.principalId) &&
        Objects.equals(this.role, roleMapping.role) &&
        Objects.equals(this.principalName, roleMapping.principalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, role, principalName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMapping {\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
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

