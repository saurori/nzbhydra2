/*
 *  (C) Copyright 2023 TheOtherP (theotherp@posteo.net)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.nzbhydra.externalapi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.nzbhydra.HydraClient;
import org.nzbhydra.HydraResponse;
import org.nzbhydra.Jackson;
import org.nzbhydra.TestConfig;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {TestConfig.class})
public class ExternalApiSearchingTest {

    @Autowired
    private HydraClient hydraClient;

    @Test
    public void shouldComplainWithoutApiKey() throws Exception {
        final HydraResponse response = hydraClient.get("/api");
        final String body = response.body();
        Assertions.assertThat(body).contains("Wrong api key");
    }

    @Test
    public void shouldSearch() throws Exception {
        final HydraResponse response = hydraClient.get("/api", "apikey=apikey", "t=search", "q=123");
        final String body = response.body();
        NewznabXmlRoot root = Jackson.getUnmarshal(body);
        Assertions.assertThat(root).isNotNull();
        Assertions.assertThat(root.getRssChannel().getItems()).isNotEmpty();
    }


}
