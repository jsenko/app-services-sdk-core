"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.13.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_instance_sdk
from rhoas_kafka_instance_sdk.model.config_entry import ConfigEntry
from rhoas_kafka_instance_sdk.model.partition import Partition
globals()['ConfigEntry'] = ConfigEntry
globals()['Partition'] = Partition
from rhoas_kafka_instance_sdk.model.topic_all_of import TopicAllOf


class TestTopicAllOf(unittest.TestCase):
    """TopicAllOf unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTopicAllOf(self):
        """Test TopicAllOf"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TopicAllOf()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
