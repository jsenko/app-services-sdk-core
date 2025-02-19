/* tslint:disable */
/* eslint-disable */
/**
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



/**
 * 
 * @export
 * @enum {string}
 */

export const TopicOrderKey = {
    Name: 'name',
    Partitions: 'partitions',
    RetentionMs: 'retention.ms',
    RetentionBytes: 'retention.bytes'
} as const;

export type TopicOrderKey = typeof TopicOrderKey[keyof typeof TopicOrderKey];



