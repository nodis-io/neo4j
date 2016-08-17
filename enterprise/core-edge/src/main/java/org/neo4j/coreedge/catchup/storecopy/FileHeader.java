/*
 * Copyright (c) 2002-2016 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.coreedge.catchup.storecopy;

import org.neo4j.coreedge.messaging.BaseMessage;

public class FileHeader extends BaseMessage
{
    private final String fileName;
    private final long fileLength;

    public FileHeader( byte version, String fileName, long fileLength )
    {
        super( version );
        this.fileName = fileName;
        this.fileLength = fileLength;
    }

    public long fileLength()
    {
        return fileLength;
    }

    public String fileName()
    {
        return fileName;
    }

    @Override
    public String toString()
    {
        return "FileHeader{" + "fileName='" + fileName + '\'' + ", fileLength=" + fileLength + '}';
    }
}
