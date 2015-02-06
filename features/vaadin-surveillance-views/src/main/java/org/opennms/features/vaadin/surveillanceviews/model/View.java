package org.opennms.features.vaadin.surveillanceviews.model;

/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2013-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
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

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents the view element of the surveillance view configuration xml
 */
@XmlRootElement
public class View {

    private List<RowDef> m_rows = new LinkedList<RowDef>();
    private List<ColumnDef> m_columns = new LinkedList<ColumnDef>();
    private java.lang.String m_name = "untitled";
    private java.lang.Integer m_refreshSeconds = 300;

    @XmlElement(name = "row-def")
    @XmlElementWrapper(name = "rows")
    public List<RowDef> getRows() {
        return m_rows;
    }

    @XmlElement(name = "column-def")
    @XmlElementWrapper(name = "columns")
    public List<ColumnDef> getColumns() {
        return m_columns;
    }

    @XmlAttribute(name = "name", required = true)
    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        this.m_name = name;
    }

    @XmlAttribute(name = "refresh-seconds", required = false)
    public int getRefreshSeconds() {
        return m_refreshSeconds;
    }

    public void setRefreshSeconds(int refreshSeconds) {
        this.m_refreshSeconds = refreshSeconds;
    }

    public RowDef getRowDef(String label) {
        for (RowDef rowDef : getRows()) {
            if (label.equals(rowDef.getLabel())) {
                return rowDef;
            }
        }
        return null;
    }

    public ColumnDef getColumnDef(String label) {
        for (ColumnDef columnDef : getColumns()) {
            if (label.equals(columnDef.getLabel())) {
                return columnDef;
            }
        }
        return null;
    }
}
