/*
 * Copyright (c) 2007-2012 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.nexus.examples.virusscan;

import org.sonatype.nexus.proxy.item.StorageFileItem;

/**
 * Virus scanner pluggable abstraction.
 *
 * @since 1.0
 */
public interface VirusScanner
{
    /**
     * Check if the given item has a virus or not.
     *
     * @return  True if the item has a virus; else false.
     */
    boolean hasVirus(StorageFileItem item);
}
