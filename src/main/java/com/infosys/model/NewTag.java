/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
package com.infosys.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewTag {
	private String newTagString;

	public NewTag() {
		super();
	}

	public String getNewTagString() {
		return newTagString;
	}

	public void setNewTagString(String newTagString) {
		this.newTagString = newTagString;
	}
}
