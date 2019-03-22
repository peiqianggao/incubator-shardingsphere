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

package org.apache.shardingsphere.core.parse.parser.dialect.mysql.clause;

import org.apache.shardingsphere.core.parse.lexer.LexerEngine;
import org.apache.shardingsphere.core.parse.lexer.dialect.mysql.MySQLKeyword;
import org.apache.shardingsphere.core.parse.lexer.token.DefaultKeyword;
import org.apache.shardingsphere.core.parse.lexer.token.Keyword;
import org.apache.shardingsphere.core.parse.parser.clause.GroupByClauseParser;

/**
 * Group by clause parser for MySQL.
 *
 * @author zhangliang
 */
public final class MySQLGroupByClauseParser extends GroupByClauseParser {
    
    public MySQLGroupByClauseParser(final LexerEngine lexerEngine) {
        super(lexerEngine);
    }
    
    @Override
    protected Keyword[] getUnsupportedKeywordBeforeGroupByItem() {
        return new Keyword[0];
    }
    
    @Override
    protected Keyword[] getSkippedKeywordAfterGroupBy() {
        return new Keyword[] {DefaultKeyword.WITH, MySQLKeyword.ROLLUP};
    }
}
