/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 */
@ApiModel(description = "StatefulSetStatus represents the current state of a StatefulSet.")

public class V1beta1StatefulSetStatus {
  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  public V1beta1StatefulSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * most recent generation observed by this StatefulSet.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "most recent generation observed by this StatefulSet.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1beta1StatefulSetStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the number of actual replicas.
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "Replicas is the number of actual replicas.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1StatefulSetStatus v1beta1StatefulSetStatus = (V1beta1StatefulSetStatus) o;
    return Objects.equals(this.observedGeneration, v1beta1StatefulSetStatus.observedGeneration) &&
        Objects.equals(this.replicas, v1beta1StatefulSetStatus.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedGeneration, replicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1StatefulSetStatus {\n");
    
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

