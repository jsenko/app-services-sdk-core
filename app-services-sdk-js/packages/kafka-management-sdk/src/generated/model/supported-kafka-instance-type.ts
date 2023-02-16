/* tslint:disable */
/* eslint-disable */
/**
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


import { SupportedKafkaBillingModel } from './supported-kafka-billing-model';
import { SupportedKafkaSize } from './supported-kafka-size';

/**
 * Supported Kafka instance type
 * @export
 * @interface SupportedKafkaInstanceType
 */
export interface SupportedKafkaInstanceType {
    /**
     * Unique identifier of the Kafka instance type.
     * @type {string}
     * @memberof SupportedKafkaInstanceType
     */
    'id'?: string;
    /**
     * Human readable name of the supported Kafka instance type
     * @type {string}
     * @memberof SupportedKafkaInstanceType
     */
    'display_name'?: string;
    /**
     * A list of available kafka billing models for the instance type. Each kafka billing model item has a unique \'id\'
     * @type {Array<SupportedKafkaBillingModel>}
     * @memberof SupportedKafkaInstanceType
     */
    'supported_billing_models': Array<SupportedKafkaBillingModel>;
    /**
     * A list of Kafka instance sizes available for this instance type
     * @type {Array<SupportedKafkaSize>}
     * @memberof SupportedKafkaInstanceType
     */
    'sizes': Array<SupportedKafkaSize>;
}

