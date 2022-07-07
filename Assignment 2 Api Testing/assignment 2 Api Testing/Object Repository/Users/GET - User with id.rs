<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET - User with id</name>
   <tag></tag>
   <elementGuidId>b0fd2207-eb2e-45ff-8ed1-759ad0dc8983</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d3b47c21-2ae3-4b1e-a2df-7bf2c0802310</webElementGuid>
   </httpHeaderProperties>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/users/1</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>18</defaultValue>
      <description></description>
      <id>0ff0fdb5-ffe2-454e-8cf9-c2d44e21ddac</id>
      <masked>false</masked>
      <name>age</name>
   </variables>
   <variables>
      <defaultValue>'MALE'</defaultValue>
      <description></description>
      <id>7c77cd5e-e69d-4bf6-bf4c-242ca104081c</id>
      <masked>false</masked>
      <name>gender</name>
   </variables>
   <variables>
      <defaultValue>'mimi'</defaultValue>
      <description></description>
      <id>30565e15-eece-49b1-8159-ac9a99a956aa</id>
      <masked>false</masked>
      <name>username</name>
   </variables>
   <variables>
      <defaultValue>'123456789'</defaultValue>
      <description></description>
      <id>303e8db4-748d-4300-878d-05ef1956d9b6</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
assert response.getStatusCode() == 200



WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'name', 'Leanne Graham')
WS.verifyElementPropertyValue(response, 'username', 'Bret')
WS.verifyElementPropertyValue(response, 'email', 'Sincere@april.biz')
WS.verifyElementPropertyValue(response, 'address.street', 'Kulas Light')
WS.verifyElementPropertyValue(response, 'address.suite', 'Apt. 556')
WS.verifyElementPropertyValue(response, 'address.city', 'Gwenborough')
WS.verifyElementPropertyValue(response, 'address.zipcode', '92998-3874')
WS.verifyElementPropertyValue(response, 'address.geo.lat', '-37.3159')
WS.verifyElementPropertyValue(response, 'address.geo.lng', '81.1496')
WS.verifyElementPropertyValue(response, 'phone', '1-770-736-8031 x56442')
WS.verifyElementPropertyValue(response, 'website', 'hildegard.org')
WS.verifyElementPropertyValue(response, 'company.name', 'Romaguera-Crona')
WS.verifyElementPropertyValue(response, 'company.catchPhrase', 'Multi-layered client-server neural-net')
WS.verifyElementPropertyValue(response, 'company.bs', 'harness real-time e-markets')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
