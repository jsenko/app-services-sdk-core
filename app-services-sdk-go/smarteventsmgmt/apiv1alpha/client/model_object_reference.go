/*
 * Red Hat Openshift SmartEvents Fleet Manager V2
 *
 * The API exposed by the fleet manager of the SmartEvents service.
 *
 * API version: 0.0.1
 * Contact: openbridge-dev@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package smarteventsmgmtclient

import (
	"encoding/json"
)

// ObjectReference struct for ObjectReference
type ObjectReference struct {
	Kind string `json:"kind"`
	Id string `json:"id"`
	Name *string `json:"name,omitempty"`
	Href string `json:"href"`
}

// NewObjectReference instantiates a new ObjectReference object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObjectReference(kind string, id string, href string) *ObjectReference {
	this := ObjectReference{}
	this.Kind = kind
	this.Id = id
	this.Href = href
	return &this
}

// NewObjectReferenceWithDefaults instantiates a new ObjectReference object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObjectReferenceWithDefaults() *ObjectReference {
	this := ObjectReference{}
	return &this
}

// GetKind returns the Kind field value
func (o *ObjectReference) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *ObjectReference) GetKindOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *ObjectReference) SetKind(v string) {
	o.Kind = v
}

// GetId returns the Id field value
func (o *ObjectReference) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ObjectReference) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ObjectReference) SetId(v string) {
	o.Id = v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ObjectReference) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjectReference) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ObjectReference) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ObjectReference) SetName(v string) {
	o.Name = &v
}

// GetHref returns the Href field value
func (o *ObjectReference) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *ObjectReference) GetHrefOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *ObjectReference) SetHref(v string) {
	o.Href = v
}

func (o ObjectReference) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["href"] = o.Href
	}
	return json.Marshal(toSerialize)
}

type NullableObjectReference struct {
	value *ObjectReference
	isSet bool
}

func (v NullableObjectReference) Get() *ObjectReference {
	return v.value
}

func (v *NullableObjectReference) Set(val *ObjectReference) {
	v.value = val
	v.isSet = true
}

func (v NullableObjectReference) IsSet() bool {
	return v.isSet
}

func (v *NullableObjectReference) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjectReference(val *ObjectReference) *NullableObjectReference {
	return &NullableObjectReference{value: val, isSet: true}
}

func (v NullableObjectReference) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjectReference) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


