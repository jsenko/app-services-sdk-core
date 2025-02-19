/*
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.13.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.auth.models.ConfigEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The settings that are applicable to this topic. This includes partitions, configuration information, and number of replicas.
 */
@ApiModel(description = "The settings that are applicable to this topic. This includes partitions, configuration information, and number of replicas.")
@JsonPropertyOrder({
  TopicSettings.JSON_PROPERTY_NUM_PARTITIONS,
  TopicSettings.JSON_PROPERTY_CONFIG
})
@JsonTypeName("TopicSettings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TopicSettings {
  public static final String JSON_PROPERTY_NUM_PARTITIONS = "numPartitions";
  private Integer numPartitions;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private List<ConfigEntry> config = null;

  public TopicSettings() { 
  }

  public TopicSettings numPartitions(Integer numPartitions) {
    
    this.numPartitions = numPartitions;
    return this;
  }

   /**
   * Number of partitions for this topic. If not specified, the default for new topics is &#x60;1&#x60;. Number of partitions may not be reduced when updating existing topics
   * minimum: 1
   * maximum: 100
   * @return numPartitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of partitions for this topic. If not specified, the default for new topics is `1`. Number of partitions may not be reduced when updating existing topics")
  @JsonProperty(JSON_PROPERTY_NUM_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPartitions() {
    return numPartitions;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPartitions(Integer numPartitions) {
    this.numPartitions = numPartitions;
  }


  public TopicSettings config(List<ConfigEntry> config) {
    
    this.config = config;
    return this;
  }

  public TopicSettings addConfigItem(ConfigEntry configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * Topic configuration entries.
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Topic configuration entries.")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConfigEntry> getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(List<ConfigEntry> config) {
    this.config = config;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicSettings topicSettings = (TopicSettings) o;
    return Objects.equals(this.numPartitions, topicSettings.numPartitions) &&
        Objects.equals(this.config, topicSettings.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPartitions, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicSettings {\n");
    sb.append("    numPartitions: ").append(toIndentedString(numPartitions)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

