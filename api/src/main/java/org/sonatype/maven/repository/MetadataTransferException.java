package org.sonatype.maven.repository;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * @author Benjamin Bentmann
 */
public class MetadataTransferException
    extends RepositoryException
{

    private final Metadata metadata;

    private final RemoteRepository repository;

    public MetadataTransferException( Metadata metadata, RemoteRepository repository, String message )
    {
        super( message );

        this.metadata = metadata;
        this.repository = repository;
    }

    public MetadataTransferException( Metadata metadata, RemoteRepository repository, Throwable cause )
    {
        super( "Could not transfer metadata " + metadata + ( repository != null ? " from " + repository : "" )
            + getMessage( ": ", cause ), cause );

        this.metadata = metadata;
        this.repository = repository;
    }

    public Metadata getMetadata()
    {
        return metadata;
    }

    public RemoteRepository getRepository()
    {
        return repository;
    }

}