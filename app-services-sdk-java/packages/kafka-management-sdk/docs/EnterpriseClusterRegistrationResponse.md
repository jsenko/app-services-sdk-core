

# EnterpriseClusterRegistrationResponse

Enterprise cluster registration endpoint response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**kind** | **String** |  | 
**href** | **String** |  | 
**accessKafkasViaPrivateNetwork** | **Boolean** | Indicates whether Kafkas created on this data plane cluster have to be accessed via private network | 
**clusterId** | **String** | OCM cluster id of the registered Enterprise cluster |  [optional]
**status** | **String** | status of registered Enterprise cluster |  [optional]
**fleetshardParameters** | [**List&lt;FleetshardParameter&gt;**](FleetshardParameter.md) |  |  [optional]



