/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sql.parser.integrate.jaxb.table;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public final class ExpectedTable {
    
    @XmlAttribute
    private String name;
    
    @XmlAttribute
    private String alias;
    
    @XmlAttribute(name = "start-delimiter")
    private String startDelimiter = "";
    
    @XmlAttribute(name = "end-delimiter")
    private String endDelimiter = "";
    
    @XmlAttribute(name = "start-index")
    private int startIndex;
    
    @XmlAttribute(name = "stop-index")
    private int stopIndex;
    
    @XmlElement
    private ExpectedTableOwner owner;
}
