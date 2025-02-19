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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Returns the capacity related information
 */
@ApiModel(description = "Returns the capacity related information")
@JsonPropertyOrder({
  EnterpriseClusterAllOfCapacityInformation.JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT,
  EnterpriseClusterAllOfCapacityInformation.JSON_PROPERTY_MAXIMUM_KAFKA_STREAMING_UNITS,
  EnterpriseClusterAllOfCapacityInformation.JSON_PROPERTY_REMAINING_KAFKA_STREAMING_UNITS,
  EnterpriseClusterAllOfCapacityInformation.JSON_PROPERTY_CONSUMED_KAFKA_STREAMING_UNITS
})
@JsonTypeName("EnterpriseCluster_allOf_capacity_information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseClusterAllOfCapacityInformation {
  public static final String JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT = "kafka_machine_pool_node_count";
  private Integer kafkaMachinePoolNodeCount;

  public static final String JSON_PROPERTY_MAXIMUM_KAFKA_STREAMING_UNITS = "maximum_kafka_streaming_units";
  private Integer maximumKafkaStreamingUnits;

  public static final String JSON_PROPERTY_REMAINING_KAFKA_STREAMING_UNITS = "remaining_kafka_streaming_units";
  private Integer remainingKafkaStreamingUnits;

  public static final String JSON_PROPERTY_CONSUMED_KAFKA_STREAMING_UNITS = "consumed_kafka_streaming_units";
  private Integer consumedKafkaStreamingUnits;

  public EnterpriseClusterAllOfCapacityInformation() { 
  }

  public EnterpriseClusterAllOfCapacityInformation kafkaMachinePoolNodeCount(Integer kafkaMachinePoolNodeCount) {
    
    this.kafkaMachinePoolNodeCount = kafkaMachinePoolNodeCount;
    return this;
  }

   /**
   * The kafka machine pool node count provided during cluster registration
   * @return kafkaMachinePoolNodeCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The kafka machine pool node count provided during cluster registration")
  @JsonProperty(JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getKafkaMachinePoolNodeCount() {
    return kafkaMachinePoolNodeCount;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKafkaMachinePoolNodeCount(Integer kafkaMachinePoolNodeCount) {
    this.kafkaMachinePoolNodeCount = kafkaMachinePoolNodeCount;
  }


  public EnterpriseClusterAllOfCapacityInformation maximumKafkaStreamingUnits(Integer maximumKafkaStreamingUnits) {
    
    this.maximumKafkaStreamingUnits = maximumKafkaStreamingUnits;
    return this;
  }

   /**
   * The maximum number of Kafka streaming units that can be created on this cluster
   * @return maximumKafkaStreamingUnits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum number of Kafka streaming units that can be created on this cluster")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_KAFKA_STREAMING_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaximumKafkaStreamingUnits() {
    return maximumKafkaStreamingUnits;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_KAFKA_STREAMING_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaximumKafkaStreamingUnits(Integer maximumKafkaStreamingUnits) {
    this.maximumKafkaStreamingUnits = maximumKafkaStreamingUnits;
  }


  public EnterpriseClusterAllOfCapacityInformation remainingKafkaStreamingUnits(Integer remainingKafkaStreamingUnits) {
    
    this.remainingKafkaStreamingUnits = remainingKafkaStreamingUnits;
    return this;
  }

   /**
   * The remaining number of Kafka streaming units that can be still be created on this cluster
   * @return remainingKafkaStreamingUnits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The remaining number of Kafka streaming units that can be still be created on this cluster")
  @JsonProperty(JSON_PROPERTY_REMAINING_KAFKA_STREAMING_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRemainingKafkaStreamingUnits() {
    return remainingKafkaStreamingUnits;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_KAFKA_STREAMING_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemainingKafkaStreamingUnits(Integer remainingKafkaStreamingUnits) {
    this.remainingKafkaStreamingUnits = remainingKafkaStreamingUnits;
  }


  public EnterpriseClusterAllOfCapacityInformation consumedKafkaStreamingUnits(Integer consumedKafkaStreamingUnits) {
    
    this.consumedKafkaStreamingUnits = consumedKafkaStreamingUnits;
    return this;
  }

   /**
   * The number of Kafka streaming units that have been consumed on this cluster
   * @return consumedKafkaStreamingUnits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of Kafka streaming units that have been consumed on this cluster")
  @JsonProperty(JSON_PROPERTY_CONSUMED_KAFKA_STREAMING_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getConsumedKafkaStreamingUnits() {
    return consumedKafkaStreamingUnits;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMED_KAFKA_STREAMING_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumedKafkaStreamingUnits(Integer consumedKafkaStreamingUnits) {
    this.consumedKafkaStreamingUnits = consumedKafkaStreamingUnits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseClusterAllOfCapacityInformation enterpriseClusterAllOfCapacityInformation = (EnterpriseClusterAllOfCapacityInformation) o;
    return Objects.equals(this.kafkaMachinePoolNodeCount, enterpriseClusterAllOfCapacityInformation.kafkaMachinePoolNodeCount) &&
        Objects.equals(this.maximumKafkaStreamingUnits, enterpriseClusterAllOfCapacityInformation.maximumKafkaStreamingUnits) &&
        Objects.equals(this.remainingKafkaStreamingUnits, enterpriseClusterAllOfCapacityInformation.remainingKafkaStreamingUnits) &&
        Objects.equals(this.consumedKafkaStreamingUnits, enterpriseClusterAllOfCapacityInformation.consumedKafkaStreamingUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkaMachinePoolNodeCount, maximumKafkaStreamingUnits, remainingKafkaStreamingUnits, consumedKafkaStreamingUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseClusterAllOfCapacityInformation {\n");
    sb.append("    kafkaMachinePoolNodeCount: ").append(toIndentedString(kafkaMachinePoolNodeCount)).append("\n");
    sb.append("    maximumKafkaStreamingUnits: ").append(toIndentedString(maximumKafkaStreamingUnits)).append("\n");
    sb.append("    remainingKafkaStreamingUnits: ").append(toIndentedString(remainingKafkaStreamingUnits)).append("\n");
    sb.append("    consumedKafkaStreamingUnits: ").append(toIndentedString(consumedKafkaStreamingUnits)).append("\n");
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

