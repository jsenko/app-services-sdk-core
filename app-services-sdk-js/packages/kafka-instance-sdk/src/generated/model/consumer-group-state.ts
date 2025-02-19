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

export const ConsumerGroupState = {
    Unknown: 'UNKNOWN',
    PreparingRebalance: 'PREPARING_REBALANCE',
    CompletingRebalance: 'COMPLETING_REBALANCE',
    Stable: 'STABLE',
    Dead: 'DEAD',
    Empty: 'EMPTY'
} as const;

export type ConsumerGroupState = typeof ConsumerGroupState[keyof typeof ConsumerGroupState];



