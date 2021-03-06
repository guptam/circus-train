/**
 * Copyright (C) 2016-2017 Expedia Inc.
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
package com.hotels.bdp.circustrain.api.metadata;

import org.apache.hadoop.hive.metastore.api.Partition;

/**
 * Implement this class to provide transformations of {@link Partition} metadata.
 * <p>
 * If an external implementation of this interface is found on the classpath then it will be applied to all the
 * partitions of all replicated partitioned tables.
 * </p>
 */
public interface PartitionTransformation {

  public static final PartitionTransformation IDENTITY = new PartitionTransformation() {
    @Override
    public Partition transform(Partition partition) {
      return partition;
    }
  };

  Partition transform(Partition partition);

}
