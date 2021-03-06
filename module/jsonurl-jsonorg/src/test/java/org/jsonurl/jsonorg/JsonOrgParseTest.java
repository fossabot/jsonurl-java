package org.jsonurl.jsonorg;

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

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsonurl.AbstractParseTest;

/**
 * Abstract base class for parser tests.
 *
 * <p>A specialization of this class may be created for each
 * factory constant defined in {@link JsonOrgValueFactory}.
 * 
 * @author jsonurl.org
 * @author David MacCormack
 * @since 2019-09-01
 */
abstract class JsonOrgParseTest extends AbstractParseTest<
    Object,
    Object,
    JSONArray,
    JSONArray,
    JSONObject,
    JSONObject,
    Boolean,
    Number,
    Object,
    String> {

    /**
     * Create a new JsonOrgParseTest.
     */
    public JsonOrgParseTest(JsonOrgValueFactory factory) {
        super(factory);
    }
    
    @Override
    protected JSONArray getArray(String key, JSONObject value) {
        return (JSONArray)value.get(key);
    }

    @Override
    protected JSONArray getArray(int index, JSONArray value) {
        return (JSONArray)value.get(index);
    }

    @Override
    protected JSONObject getObject(int index, JSONArray value) {
        return (JSONObject)value.get(index);
    }
    
    @Override
    protected JSONObject getObject(String key, JSONObject value) {
        return (JSONObject)value.get(key);
    }

    @Override
    protected Number getNumber(int index, JSONArray value) {
        return (Number)value.get(index);
    }
    
    @Override
    protected Number getNumber(String key, JSONObject value) {
        return (Number)value.get(key);
    }

    @Override
    protected String getString(String key, JSONObject value) {
        return (String)value.get(key);
    }
    
    @Override
    protected boolean getBoolean(String key, JSONObject value) {
        Object ret = value.get(key);
        
        if (ret instanceof Boolean) {
            return ((Boolean)ret).booleanValue();
        }
        
        throw new IllegalArgumentException("value not boolean: " + ret);
    }
    
    @Override
    protected boolean getNull(String key, JSONObject value) {
        Object ret = value.get(key);
        return factory.getNull() == ret;
    }
    
    @Override
    protected boolean getEmptyComposite(String key, JSONObject value) {
        return factory.isEmpty(value.get(key));
    }
}
