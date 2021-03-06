package org.jsonurl;

/*
 * Copyright 2019 David MacCormack
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;
import java.util.Map;

/**
 * A {@link org.jsonurl.Parser Parser} based on J2SE8 data types.
 *
 * @author jsonurl.org
 * @author David MacCormack
 * @since 2019-09-01
 */
public class JavaValueParser extends Parser.TransparentBuilder<Object,
    Object,
    List<Object>,
    Map<String,Object>,
    Boolean,
    Number,
    Object,
    String> {

    /**
     * Instantiate a new Parser.
     */
    public JavaValueParser() {
        this(JavaValueFactory.PRIMITIVE);
    }
    
    /**
     * Instantiate a new Parser.
     */
    public JavaValueParser(JavaValueFactory factory) {
        super(factory);
    }
}
