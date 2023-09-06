/*******************************************************************************
 * Copyright (c) 2023 Contributors to the Eclipse Foundation.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   See git history
 *******************************************************************************/
package org.eclipse.lsp4e.format;

import java.net.URI;

/**
 * Can be implemented by clients as OSGi service
 * to provide editor specific formatting regions for the format-on-save feature.
 */
public interface IFormatRegionsProvider extends IFormatRegions {

	/**
	 * Checks whether this provider can be applied to the given URI.
	 * Ensures that this service is only used for its associated language.
	 * @param uri
	 * @return true if the provider can be applied to the given URI
	 */
	boolean isEnabledFor(URI uri);

}