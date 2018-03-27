/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.logic.players;

import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.entity.internal.EngineEntityManager;
import org.terasology.entitySystem.metadata.ComponentLibrary;
import org.terasology.persistence.serializers.EntitySerializer;
import org.terasology.persistence.typeHandling.TypeSerializationLibrary;
import org.terasology.protobuf.EntityData;

import java.util.Map;

public class PlayerEntitySerializer extends EntitySerializer {
    protected EntityRef controller;

    public PlayerEntitySerializer(EngineEntityManager entityManager,EntityRef controller) {
        super(entityManager);
        this.controller = controller;
    }



    @Override
    public EntityRef deserialize(EntityData.Entity entityData) {
        Map<Class<? extends Component>, Component> componentMap = createInitialComponents(entityData);
        deserializeOntoComponents(entityData, componentMap);
        return entityManager.createEntityWithId(entityData.getId(), componentMap.values(),controller);
    }
}
