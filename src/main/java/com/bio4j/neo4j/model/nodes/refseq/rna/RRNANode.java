/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.bio4j.neo4jdb.model.nodes.refseq.rna;

import com.bio4j.neo4jdb.model.nodes.refseq.GenomeElementNode;
import com.bio4j.neo4jdb.model.relationships.refseq.GenomeElementRRnaRel;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Node;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class RRNANode extends RNANode{
    
    public static final String NODE_TYPE = RRNANode.class.getCanonicalName();
    
    public RRNANode(Node n){
        super(n);
    }
    
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(node.getRelationships(new GenomeElementRRnaRel(null), Direction.INCOMING).iterator().next().getStartNode());
    }
    
    
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof RRNANode){
            RRNANode other = (RRNANode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }
    
}
