Narrative

Scenario: Verify my local host API Call
Given I have a Base URI <baseURI> for the REST API
And its base path is <BASE_PATH>
And its endpoint is <ENDPOINT>
When I send the <REQUEST_TYPE> request to RestAPI
Then the REST API should return me a valid response

Examples:
|            baseURI             |  BASE_PATH   | ENDPOINT|REQUEST_TYPE|
|  http://localhost:9999/com.jaxrs.api| /webapi/hotels  |/getAll|GET|



Scenario: Verify the REST response for a GET request returns all the mandatory fields
Given I have a Base URI <baseURI> for the REST API
And its base path is <BASE_PATH>
And its endpoint is <ENDPOINT>
When I send the <REQUEST_TYPE> request to RestAPI
Then all the mandatory fields should be returned in the response

Examples:
|            baseURI             |  BASE_PATH   |    ENDPOINT |REQUEST_TYPE|
|  http://localhost:9999/com.jaxrs.api|  /webapi/hotels | /getAll|GET|


Scenario: Verify the REST response after the POST request
Given I have a Base URI <baseURI> for the REST API
And its base path is <BASE_PATH>
And its endpoint is <ENDPOINT>
And its body message is <BODY>
When I send the <REQUEST_TYPE> request to RestAPI
Then the REST API should return me a valid response

Examples:
|            baseURI             |  BASE_PATH   |    ENDPOINT | REQUEST_TYPE|BODY|
|  http://localhost:9999/com.jaxrs.api|  /webapi/hotels | /add|POST| {"hotelName": "Nirvana","location": "Kazhipattur","ratings": "5","landmark": " Opp to Victoria Towers","startedOn": " 19/09/2008","famousDish": "Appam"}|