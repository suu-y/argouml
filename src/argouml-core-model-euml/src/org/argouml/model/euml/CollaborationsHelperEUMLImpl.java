// $Id$
/***********************************************************************
 * Copyright (c) 2007,2010 Tom Morris and other contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tom Morris - initial API and implementation
 ***********************************************************************/
package org.argouml.model.euml;

import java.util.Collection;

import org.argouml.model.CollaborationsHelper;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageSort;

/**
 * Eclipse UML2 implementation of CollaborationsHelper.
 */
class CollaborationsHelperEUMLImpl implements CollaborationsHelper {

    /**
     * The model implementation.
     */
    private EUMLModelImplementation modelImpl;

    /**
     * Constructor.
     *
     * @param implementation The ModelImplementation.
     */
    public CollaborationsHelperEUMLImpl(
            EUMLModelImplementation implementation) {
        modelImpl = implementation;
    }

    public void addBase(Object arole, Object abase) {
        System.out.println("SATD ID: 1060");
        
    }

    public void addConstrainingElement(Object handle, Object constraint) {
        System.out.println("SATD ID: 382");
        
    }

    public void addInstance(Object classifierRole, Object instance) {
        System.out.println("SATD ID: 520");
        
    }

    public void addMessage(Object handle, Object elem) {
        System.out.println("SATD ID: 1047");
        
    }

    public void addPredecessor(Object handle, Object predecessor) {
        System.out.println("SATD ID: 665");
        
    }

    public void addSuccessor(Object handle, Object mess) {
        System.out.println("SATD ID: 358");
        
    }

    public Collection allAvailableContents(Object arole) {
        System.out.println("SATD ID: 732");
        return null;
    }

    public Collection allAvailableFeatures(Object arole) {
        System.out.println("SATD ID: 357");
        return null;
    }

    public Collection getAllClassifierRoles(Object ns) {
        System.out.println("SATD ID: 1137");
        return null;
    }

    public Collection getAllPossibleActivators(Object ames) {
        System.out.println("SATD ID: 222");
        return null;
    }

    public Collection getAllPossibleAssociationRoles(Object role) {
        System.out.println("SATD ID: 123");
        return null;
    }

    public Collection getAllPossibleBases(Object role) {
        System.out.println("SATD ID: 233");
        return null;
    }

    public Collection getAllPossiblePredecessors(Object amessage) {
        System.out.println("SATD ID: 36");
        return null;
    }

    public Object getAssociationRole(Object afrom, Object ato) {
        System.out.println("SATD ID: 285");
        return null;
    }

    public Collection getClassifierRoles(Object role) {
        System.out.println("SATD ID: 21");
        return null;
    }

    public boolean hasAsActivator(Object message, Object activator) {
        System.out.println("SATD ID: 529");
        return false;
    }

    public boolean isAddingCollaborationAllowed(Object context) {
        System.out.println("SATD ID: 632");
        return false;
    }

    public void removeBase(Object handle, Object c) {
        System.out.println("SATD ID: 976");
        
    }

    public void removeConstrainingElement(Object handle, Object constraint) {
        System.out.println("SATD ID: 618");
        
    }

    public void removeInteraction(Object collab, Object interaction) {
        System.out.println("SATD ID: 1010");
        
    }

    public void removeMessage(Object handle, Object message) {
        System.out.println("SATD ID: 887");
        
    }

    public void removePredecessor(Object handle, Object message) {
        System.out.println("SATD ID: 1073");
        
    }

    public void removeSuccessor(Object handle, Object mess) {
        System.out.println("SATD ID: 963");
        
    }

    public void setAction(Object message, Object action) {
        setMessageSort(message, action);
    }

    public void setActivator(Object ames, Object anactivator) {
        System.out.println("SATD ID: 1088");
        
    }

    public void setBase(Object arole, Object abase) {
        System.out.println("SATD ID: 265");
        
    }

    public void setBases(Object role, Collection bases) {
        System.out.println("SATD ID: 539");
        
    }

    public void setContext(Object handle, Object col) {
        System.out.println("SATD ID: 466");
        
    }
    
    public void setMessageSort(Object message, Object messageSort) {
        MessageSort ms = (MessageSort) messageSort;
        Message m = (Message) message;
        m.setMessageSort(ms);
    }

    public void setPredecessors(Object handle, Collection predecessors) {
        System.out.println("SATD ID: 860");
        
    }

    public void setRepresentedClassifier(Object handle, Object classifier) {
        System.out.println("SATD ID: 401");
        
    }

    public void setRepresentedOperation(Object handle, Object operation) {
        System.out.println("SATD ID: 147");
        
    }

    public void setSender(Object handle, Object sender) {
        System.out.println("SATD ID: 1128");
        
    }

    public void setSuccessors(Object handle, Collection messages) {
        System.out.println("SATD ID: 160");
        
    }


}
