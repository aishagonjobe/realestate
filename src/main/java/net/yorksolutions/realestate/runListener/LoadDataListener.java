package net.yorksolutions.realestate.runListener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.yorksolutions.realestate.model.RealEstate;
import net.yorksolutions.realestate.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoadDataListener implements ApplicationListener<ApplicationEvent> {
    @Autowired
    RealEstateRepository realEstateRepository;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        ObjectMapper objectMapper = new ObjectMapper();
        RealEstate[] realEstateArray = null;

        try {
            realEstateArray = objectMapper.readValue(getTestData(), RealEstate[].class);
            for (RealEstate realEstate:
                    realEstateArray) {
                realEstateRepository.save(realEstate);

            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    String getTestData(){
        return "[\n" +
                "    {\n" +
                "        \"id\": 2091,\n" +
                "        \"fname\": \"Dorci'A\",\n" +
                "        \"lname\": \"Rannila\",\n" +
                "        \"yrblt\": \"2018-06-06T22:45:52.247Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"1484 Massa Ct\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2092,\n" +
                "        \"fname\": \"Luzinda\",\n" +
                "        \"lname\": \"Red\",\n" +
                "        \"yrblt\": \"2019-06-30T12:06:23.532Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"6589 Porttitor Ln\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2093,\n" +
                "        \"fname\": \"Adom\",\n" +
                "        \"lname\": \"Reese\",\n" +
                "        \"yrblt\": \"2007-08-20T11:01:28.130Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"6916 Quis St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2094,\n" +
                "        \"fname\": \"Alonzo\",\n" +
                "        \"lname\": \"Vickers\",\n" +
                "        \"yrblt\": \"2007-05-24T08:34:33.443Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 5100,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"2162 Nullam Ln\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2095,\n" +
                "        \"fname\": \"Aida\",\n" +
                "        \"lname\": \"Gow\",\n" +
                "        \"yrblt\": \"2018-05-18T06:30:44.547Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 4300,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"6522 Nunc St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2096,\n" +
                "        \"fname\": \"Jeannine\",\n" +
                "        \"lname\": \"Demarse\",\n" +
                "        \"yrblt\": \"2018-06-10T03:59:21.781Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"523 Dolor Rd\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2097,\n" +
                "        \"fname\": \"Kathy\",\n" +
                "        \"lname\": \"Mills\",\n" +
                "        \"yrblt\": \"2012-05-15T13:51:40.393Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"9267 Mattis St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2098,\n" +
                "        \"fname\": \"Shane\",\n" +
                "        \"lname\": \"Sanvick\",\n" +
                "        \"yrblt\": \"2015-01-10T13:10:57.540Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"4069 Tortor Ct\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2099,\n" +
                "        \"fname\": \"Matthew\",\n" +
                "        \"lname\": \"Jafri\",\n" +
                "        \"yrblt\": \"2017-03-13T01:39:43.594Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4100,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"2216 Tincidunt St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2100,\n" +
                "        \"fname\": \"Valarie\",\n" +
                "        \"lname\": \"Lamsargis\",\n" +
                "        \"yrblt\": \"2010-01-10T05:18:45.243Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"3846 Pretium Ave\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2101,\n" +
                "        \"fname\": \"Amanda\",\n" +
                "        \"lname\": \"Benjamin\",\n" +
                "        \"yrblt\": \"2009-01-10T05:07:10.700Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 5800,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"4443 Id Ln\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2102,\n" +
                "        \"fname\": \"Yaw\",\n" +
                "        \"lname\": \"Graves\",\n" +
                "        \"yrblt\": \"2018-02-13T04:44:18.879Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 5800,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"5942 Nec Dr\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2103,\n" +
                "        \"fname\": \"Ollie\",\n" +
                "        \"lname\": \"Joslin\",\n" +
                "        \"yrblt\": \"2007-07-20T18:39:01.105Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"3320 Magna Ave\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2104,\n" +
                "        \"fname\": \"Cindy\",\n" +
                "        \"lname\": \"Swayngim\",\n" +
                "        \"yrblt\": \"2010-09-26T20:02:24.010Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"3672 Ipsum St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2105,\n" +
                "        \"fname\": \"Maya\",\n" +
                "        \"lname\": \"Duerksen\",\n" +
                "        \"yrblt\": \"2010-06-12T09:01:10.458Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"6078 Lacus Ct\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2106,\n" +
                "        \"fname\": \"Maya\",\n" +
                "        \"lname\": \"Aresti\",\n" +
                "        \"yrblt\": \"2014-06-28T21:44:26.965Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"4615 Massa Ave\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2107,\n" +
                "        \"fname\": \"Tina\",\n" +
                "        \"lname\": \"Corsaut\",\n" +
                "        \"yrblt\": \"2009-02-15T17:44:04.312Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"1952 At St\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2108,\n" +
                "        \"fname\": \"Kenneth\",\n" +
                "        \"lname\": \"Skiffington\",\n" +
                "        \"yrblt\": \"2018-09-14T19:40:46.320Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"1456 Et Ct\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2109,\n" +
                "        \"fname\": \"Dale\",\n" +
                "        \"lname\": \"Patillo\",\n" +
                "        \"yrblt\": \"2017-12-07T04:04:39.398Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 5100,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"2351 Ipsum St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2110,\n" +
                "        \"fname\": \"Brenda\",\n" +
                "        \"lname\": \"Stafford\",\n" +
                "        \"yrblt\": \"2017-05-11T18:19:51.972Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"6890 Amet Rd\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2111,\n" +
                "        \"fname\": \"Cathryn\",\n" +
                "        \"lname\": \"Sjaardema\",\n" +
                "        \"yrblt\": \"2012-12-13T07:08:44.021Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 4100,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"7671 Ac Dr\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2112,\n" +
                "        \"fname\": \"Peggy\",\n" +
                "        \"lname\": \"Lynn\",\n" +
                "        \"yrblt\": \"2017-07-27T21:19:14.219Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 5800,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"1858 Curabitur Rd\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2113,\n" +
                "        \"fname\": \"Louis\",\n" +
                "        \"lname\": \"Knowles\",\n" +
                "        \"yrblt\": \"2018-08-29T21:24:51.404Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 5100,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"885 Sed Ave\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2114,\n" +
                "        \"fname\": \"Camille\",\n" +
                "        \"lname\": \"Moffett\",\n" +
                "        \"yrblt\": \"2007-12-21T02:42:24.984Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"1872 Ipsum St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2115,\n" +
                "        \"fname\": \"Aubrey\",\n" +
                "        \"lname\": \"Malkewicz\",\n" +
                "        \"yrblt\": \"2011-11-05T08:20:52.544Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"5917 Tempor Ln\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2116,\n" +
                "        \"fname\": \"Deanna\",\n" +
                "        \"lname\": \"Mashburn\",\n" +
                "        \"yrblt\": \"2016-09-26T20:20:41.971Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 5800,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"4024 Augue Dr\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2117,\n" +
                "        \"fname\": \"Lavern\",\n" +
                "        \"lname\": \"Geouque\",\n" +
                "        \"yrblt\": \"2014-08-26T06:59:00.288Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 5100,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"6064 Et Dr\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2118,\n" +
                "        \"fname\": \"Scott\",\n" +
                "        \"lname\": \"Shapiro\",\n" +
                "        \"yrblt\": \"2016-05-13T05:58:23.092Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"3799 Tincidunt Ln\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2119,\n" +
                "        \"fname\": \"Amber\",\n" +
                "        \"lname\": \"Earls\",\n" +
                "        \"yrblt\": \"2017-09-27T11:14:49.833Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"7039 Consectetur Ln\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2120,\n" +
                "        \"fname\": \"Alesia\",\n" +
                "        \"lname\": \"Ramati\",\n" +
                "        \"yrblt\": \"2011-02-08T13:49:11.126Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"4026 Dolor Ave\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2121,\n" +
                "        \"fname\": \"Talatha\",\n" +
                "        \"lname\": \"Lyons\",\n" +
                "        \"yrblt\": \"2011-11-29T15:58:15.028Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4300,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"4603 Ac Dr\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2122,\n" +
                "        \"fname\": \"Latia\",\n" +
                "        \"lname\": \"Stalinski\",\n" +
                "        \"yrblt\": \"2011-08-21T23:04:40.311Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"9856 Neque Rd\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2123,\n" +
                "        \"fname\": \"Farzana\",\n" +
                "        \"lname\": \"Merkel\",\n" +
                "        \"yrblt\": \"2006-09-25T13:55:56.648Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 4100,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"3356 Aliquam Ct\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2124,\n" +
                "        \"fname\": \"Carol\",\n" +
                "        \"lname\": \"Lafave\",\n" +
                "        \"yrblt\": \"2011-02-19T07:45:45.090Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4100,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"445 Et Ln\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2125,\n" +
                "        \"fname\": \"Lontay\",\n" +
                "        \"lname\": \"Theiss\",\n" +
                "        \"yrblt\": \"2020-02-11T21:45:40.609Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 5100,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"5567 Vel Ave\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2126,\n" +
                "        \"fname\": \"Eileen\",\n" +
                "        \"lname\": \"Garner\",\n" +
                "        \"yrblt\": \"2013-06-01T09:20:09.613Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4300,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"5691 Lorem Rd\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2127,\n" +
                "        \"fname\": \"Elizabeth\",\n" +
                "        \"lname\": \"Wing\",\n" +
                "        \"yrblt\": \"2011-02-09T12:07:47.621Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"236 Scelerisque Ln\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"CRYE-LEIKE INC REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2128,\n" +
                "        \"fname\": \"Harrietta\",\n" +
                "        \"lname\": \"Dauk\",\n" +
                "        \"yrblt\": \"2008-11-11T10:23:35.171Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 5100,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"531 Mattis Ln\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2129,\n" +
                "        \"fname\": \"Hector\",\n" +
                "        \"lname\": \"Decoster\",\n" +
                "        \"yrblt\": \"2006-07-19T05:55:16.737Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 4,\n" +
                "        \"street\": \"3681 Adipiscing Ln\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2130,\n" +
                "        \"fname\": \"Shailesh\",\n" +
                "        \"lname\": \"Guilfoyle\",\n" +
                "        \"yrblt\": \"2009-03-10T08:19:17.812Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"9789 Ante St\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2131,\n" +
                "        \"fname\": \"Ginny\",\n" +
                "        \"lname\": \"Wilson\",\n" +
                "        \"yrblt\": \"2006-06-25T12:57:11.971Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4100,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"5663 Aliquam Ave\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2132,\n" +
                "        \"fname\": \"Aroterick\",\n" +
                "        \"lname\": \"Coffell\",\n" +
                "        \"yrblt\": \"2019-08-30T14:51:32.578Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 7,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"1729 Tincidunt Ave\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2133,\n" +
                "        \"fname\": \"Joe\",\n" +
                "        \"lname\": \"Patino\",\n" +
                "        \"yrblt\": \"2010-08-07T21:17:26.081Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"3111 Sit Rd\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2134,\n" +
                "        \"fname\": \"Kathe\",\n" +
                "        \"lname\": \"Steuernagel\",\n" +
                "        \"yrblt\": \"2016-05-06T17:11:15.756Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4300,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"6397 In Rd\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2135,\n" +
                "        \"fname\": \"Luis\",\n" +
                "        \"lname\": \"Kahle\",\n" +
                "        \"yrblt\": \"2017-02-23T06:25:24.999Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 6200,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 6,\n" +
                "        \"street\": \"5193 Odio Rd\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38125,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2136,\n" +
                "        \"fname\": \"Don\",\n" +
                "        \"lname\": \"Wing\",\n" +
                "        \"yrblt\": \"2006-03-23T03:31:53.701Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4300,\n" +
                "        \"baths\": 6,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"1608 Libero Ct\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38027,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2137,\n" +
                "        \"fname\": \"Frank\",\n" +
                "        \"lname\": \"Kimmel\",\n" +
                "        \"yrblt\": \"2007-06-25T08:31:11.625Z\",\n" +
                "        \"isnew\": false,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 3,\n" +
                "        \"beds\": 7,\n" +
                "        \"street\": \"4088 Vestibulum Ct\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2138,\n" +
                "        \"fname\": \"Graeme\",\n" +
                "        \"lname\": \"Levey\",\n" +
                "        \"yrblt\": \"2010-05-23T09:44:08.778Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 4500,\n" +
                "        \"baths\": 4,\n" +
                "        \"beds\": 3,\n" +
                "        \"street\": \"3335 Dolor Ave\",\n" +
                "        \"city\": \"Germantown\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"JOHN GREEN REALTORS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2139,\n" +
                "        \"fname\": \"Narendra\",\n" +
                "        \"lname\": \"Swartz\",\n" +
                "        \"yrblt\": \"2007-02-06T09:32:04.507Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 5100,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"5487 Orci Dr\",\n" +
                "        \"city\": \"Piperton\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38017,\n" +
                "        \"listing\": \"MIDSOUTH RESIDENTIAL LLC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2140,\n" +
                "        \"fname\": \"Bartley\",\n" +
                "        \"lname\": \"Nye\",\n" +
                "        \"yrblt\": \"2018-07-18T13:21:31.058Z\",\n" +
                "        \"isnew\": true,\n" +
                "        \"sqft\": 3500,\n" +
                "        \"baths\": 5,\n" +
                "        \"beds\": 5,\n" +
                "        \"street\": \"8567 Placerat Rd\",\n" +
                "        \"city\": \"Collierville\",\n" +
                "        \"state\": \"TN\",\n" +
                "        \"zip\": 38139,\n" +
                "        \"listing\": \"ADARO REALTY INC.\"\n" +
                "    }\n" +
                "]";
    }
}
