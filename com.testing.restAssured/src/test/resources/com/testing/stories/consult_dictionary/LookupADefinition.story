Narrative

Scenario: Rest API basic Look up
Given I have a Base URI <baseURI> for the REST API
And its base path is <BASE_PATH>
And its query parameter is <QUERY_PARAM>
When I send the request to RestAPI
Then the REST API should return me a valid response

Examples:
|            baseURI             |  BASE_PATH   |    QUERY_PARAM |
|  http://services.groupkt.com |  /state |  /get/*/all|



