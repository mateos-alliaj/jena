/*
 * (c) Copyright 2010 Epimorphics Ltd.
 * All rights reserved.
 * [See end of file]
 */

package org.openjena.fuseki;

import org.junit.AfterClass ;
import org.junit.BeforeClass ;
import org.junit.Test ;

import com.hp.hpl.jena.sparql.util.Convert ;

// generally poke the server.
public class TestProtocol extends BaseServerTest
{
    @BeforeClass public static void beforeClass()
    {
        serverReset() ;
        // Load some data.
        DS_Updater du = DatasetUpdaterFactory.createHTTP(serviceREST) ;
        du.putModel(graph1) ;
        du.putModel(gn1, graph2) ;
    }
    
    @AfterClass public static void afterClass()
    {
        DS_Updater du = DatasetUpdaterFactory.createHTTP(serviceREST) ;
        du.deleteDefault() ;
    }
    
    static String query(String base, String queryString)
    {
        return base+"?query="+Convert.encWWWForm(queryString) ;
    }
    
    @Test public void protocol_01()
    {
        // TODO
        String url = null ;
        String mimeType = null ; 
        execGet(url, mimeType) ;
    }

    private void execGet(String url, String mimeType)
    {}
    
    private void execPost(String url, String mimeType, String content)
    {}

}

/*
 * (c) Copyright 2010 Epimorphics Ltd.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */