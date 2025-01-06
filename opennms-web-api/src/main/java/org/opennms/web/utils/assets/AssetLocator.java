/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2017-2025 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2025 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.web.utils.assets;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Optional;

import org.springframework.web.servlet.resource.ResourceResolver;

public interface AssetLocator extends ResourceResolver {
    public void reload();
    public long lastModified();
    public Collection<String> getAssets();
    public Collection<String> getAssets(final boolean minified);
    public Optional<Collection<AssetResource>> getResources(final String asset);
    public Optional<Collection<AssetResource>> getResources(final String asset, final boolean minified);
    public Optional<AssetResource> getResource(final String asset, final String type);
    public Optional<AssetResource> getResource(final String asset, final String type, final boolean minified);
    public Optional<InputStream> open(final String asset, final String type) throws IOException;
    public Optional<InputStream> open(final String asset, final String type, final boolean minified) throws IOException;
}
