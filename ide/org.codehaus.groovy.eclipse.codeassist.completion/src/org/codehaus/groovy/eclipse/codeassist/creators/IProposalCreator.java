/*
 * Copyright 2009-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.eclipse.codeassist.creators;

import java.util.List;
import java.util.Set;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.eclipse.codeassist.proposals.IGroovyProposal;

/**
 * Creates proposals in a given completion context.
 */
public interface IProposalCreator {

    List<IGroovyProposal> findAllProposals(ClassNode type, Set<ClassNode> categories, String prefix, boolean isStatic, boolean isPrimary);

    /**
     * If true, then execute this creator twice when in closures. Once for delegate and once for this.
     */
    boolean redoForLoopClosure();
}
