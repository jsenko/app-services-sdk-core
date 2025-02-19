"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.13.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import unittest

import rhoas_kafka_instance_sdk
from rhoas_kafka_instance_sdk.api.acls_api import AclsApi  # noqa: E501


class TestAclsApi(unittest.TestCase):
    """AclsApi unit test stubs"""

    def setUp(self):
        self.api = AclsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_acl(self):
        """Test case for create_acl

        Create ACL binding  # noqa: E501
        """
        pass

    def test_delete_acls(self):
        """Test case for delete_acls

        Delete ACL bindings  # noqa: E501
        """
        pass

    def test_get_acl_resource_operations(self):
        """Test case for get_acl_resource_operations

        Retrieve allowed ACL resources and operations  # noqa: E501
        """
        pass

    def test_get_acls(self):
        """Test case for get_acls

        List ACL bindings  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
