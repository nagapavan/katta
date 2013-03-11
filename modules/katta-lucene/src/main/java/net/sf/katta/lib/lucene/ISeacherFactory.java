/**
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.katta.lib.lucene;

import net.sf.katta.util.NodeConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * A factory for creating {@link org.apache.lucene.search.IndexSearcher} on a given shard.
 * Implementations need to have a default constructor.
 */
public interface ISeacherFactory {

  void init(NodeConfiguration config);

  IndexHandle createSearcher(String shardName, File shardDir) throws IOException;

  void closeSearcher(IndexHandle indexHandle) throws IOException;
}