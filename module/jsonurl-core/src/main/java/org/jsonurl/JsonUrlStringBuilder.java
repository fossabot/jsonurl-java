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

/**
 * A JsonUrlTextAppender that appends JSON-&gt;URL text to a StringBuilder.
 *
 * @author jsonurl.org
 * @author David MacCormack
 * @since 2019-09-01
 */
public class JsonUrlStringBuilder extends
        JsonUrlTextAppender<StringBuilder,String> {

    /**
     * default StringBuilder size.
     */
    private static final int DEFAULT_SIZE = 1 << 10;

    /**
     * Create a new JsonUrlStringBuilder.
     *
     * <p>This simply calls {@link #JsonUrlStringBuilder(int)
     * JsonUrlStringBuilder(1024)}.
     */
    public JsonUrlStringBuilder() {
        this(new StringBuilder(DEFAULT_SIZE));
    }

    /**
     * Create a new JsonUrlStringBuilder.
     *
     * <p>This simply calls {@link #JsonUrlStringBuilder(StringBuilder)
     * JsonUrlStringBuilder(new StringBuilder(1024))}.
     */
    public JsonUrlStringBuilder(int size) {
        this(new StringBuilder(size));
    }

    /**
     * Create a new JsonUrlStringBuilder.
     */
    public JsonUrlStringBuilder(StringBuilder sb) {
        super(sb);
    }

    @Override
    public String build() {
        return out.toString();
    }
}
