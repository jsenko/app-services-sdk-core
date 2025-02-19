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
from rhoas_kafka_instance_sdk.model.object_reference import ObjectReference
from rhoas_kafka_instance_sdk.model.partition import Partition
from rhoas_kafka_instance_sdk.model.topic_all_of import TopicAllOf
globals()['ConfigEntry'] = ConfigEntry
globals()['ObjectReference'] = ObjectReference
globals()['Partition'] = Partition
globals()['TopicAllOf'] = TopicAllOf
from rhoas_kafka_instance_sdk.model.topic import Topic


class TestTopic(unittest.TestCase):
    """Topic unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTopic(self):
        """Test Topic"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Topic()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
