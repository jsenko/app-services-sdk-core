/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.15.0
 * Contact: rhosak-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.models.FleetshardParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EnterpriseClusterWithAddonParametersAllOf
 */
@JsonPropertyOrder({
  EnterpriseClusterWithAddonParametersAllOf.JSON_PROPERTY_FLEETSHARD_PARAMETERS
})
@JsonTypeName("EnterpriseClusterWithAddonParameters_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseClusterWithAddonParametersAllOf {
  public static final String JSON_PROPERTY_FLEETSHARD_PARAMETERS = "fleetshard_parameters";
  private List<FleetshardParameter> fleetshardParameters = null;

  public EnterpriseClusterWithAddonParametersAllOf() { 
  }

  public EnterpriseClusterWithAddonParametersAllOf fleetshardParameters(List<FleetshardParameter> fleetshardParameters) {
    
    this.fleetshardParameters = fleetshardParameters;
    return this;
  }

  public EnterpriseClusterWithAddonParametersAllOf addFleetshardParametersItem(FleetshardParameter fleetshardParametersItem) {
    if (this.fleetshardParameters == null) {
      this.fleetshardParameters = new ArrayList<>();
    }
    this.fleetshardParameters.add(fleetshardParametersItem);
    return this;
  }

   /**
   * Get fleetshardParameters
   * @return fleetshardParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLEETSHARD_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FleetshardParameter> getFleetshardParameters() {
    return fleetshardParameters;
  }


  @JsonProperty(JSON_PROPERTY_FLEETSHARD_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFleetshardParameters(List<FleetshardParameter> fleetshardParameters) {
    this.fleetshardParameters = fleetshardParameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseClusterWithAddonParametersAllOf enterpriseClusterWithAddonParametersAllOf = (EnterpriseClusterWithAddonParametersAllOf) o;
    return Objects.equals(this.fleetshardParameters, enterpriseClusterWithAddonParametersAllOf.fleetshardParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fleetshardParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseClusterWithAddonParametersAllOf {\n");
    sb.append("    fleetshardParameters: ").append(toIndentedString(fleetshardParameters)).append("\n");
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

