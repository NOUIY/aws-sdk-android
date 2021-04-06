/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO IotSiteWiseAction
 */
class IotSiteWiseActionJsonUnmarshaller implements
        Unmarshaller<IotSiteWiseAction, JsonUnmarshallerContext> {

    public IotSiteWiseAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IotSiteWiseAction iotSiteWiseAction = new IotSiteWiseAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("putAssetPropertyValueEntries")) {
                iotSiteWiseAction
                        .setPutAssetPropertyValueEntries(new ListUnmarshaller<PutAssetPropertyValueEntry>(
                                PutAssetPropertyValueEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("roleArn")) {
                iotSiteWiseAction.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return iotSiteWiseAction;
    }

    private static IotSiteWiseActionJsonUnmarshaller instance;

    public static IotSiteWiseActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IotSiteWiseActionJsonUnmarshaller();
        return instance;
    }
}