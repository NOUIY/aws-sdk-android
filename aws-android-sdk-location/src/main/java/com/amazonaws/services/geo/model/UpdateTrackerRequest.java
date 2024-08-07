/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified properties of a given tracker resource.
 * </p>
 */
public class UpdateTrackerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String trackerName;

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     */
    private String pricingPlanDataSource;

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based
     * filtering can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This helps educe the effects of GPS noise when
     * displaying device trajectories on a map, and can help control costs by
     * reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     */
    private String positionFiltering;

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     */
    private Boolean eventBridgeEnabled;

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     */
    private Boolean kmsKeyEnableGeospatialQueries;

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the tracker resource to update.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to update.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         No longer used. If included, the only allowed value is
     *         <code>RequestBasedUsage</code>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public UpdateTrackerRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public UpdateTrackerRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     *
     * @return <p>
     *         This parameter is no longer used.
     *         </p>
     */
    public String getPricingPlanDataSource() {
        return pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     *
     * @param pricingPlanDataSource <p>
     *            This parameter is no longer used.
     *            </p>
     */
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingPlanDataSource <p>
     *            This parameter is no longer used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
        return this;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         Updates the description for the tracker resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the tracker resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based
     * filtering can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This helps educe the effects of GPS noise when
     * displaying device trajectories on a map, and can help control costs by
     * reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @return <p>
     *         Updates the position filtering for the tracker resource.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TimeBased</code> - Location updates are evaluated against
     *         linked geofence collections, but not every location update is
     *         stored. If your update frequency is more often than 30 seconds,
     *         only one update per 30 seconds is stored for each unique device
     *         ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DistanceBased</code> - If the device has moved less than 30
     *         m (98.4 ft), location updates are ignored. Location updates
     *         within this distance are neither evaluated against linked
     *         geofence collections, nor stored. This helps control costs by
     *         reducing the number of geofence evaluations and historical device
     *         positions to paginate through. Distance-based filtering can also
     *         reduce the effects of GPS noise when displaying device
     *         trajectories on a map.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccuracyBased</code> - If the device has moved less than
     *         the measured accuracy, location updates are ignored. For example,
     *         if two consecutive updates from a device have a horizontal
     *         accuracy of 5 m and 10 m, the second update is ignored if the
     *         device has moved less than 15 m. Ignored location updates are
     *         neither evaluated against linked geofence collections, nor
     *         stored. This helps educe the effects of GPS noise when displaying
     *         device trajectories on a map, and can help control costs by
     *         reducing the number of geofence evaluations.
     *         </p>
     *         </li>
     *         </ul>
     * @see PositionFiltering
     */
    public String getPositionFiltering() {
        return positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based
     * filtering can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This helps educe the effects of GPS noise when
     * displaying device trajectories on a map, and can help control costs by
     * reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and historical
     *            device positions to paginate through. Distance-based filtering
     *            can also reduce the effects of GPS noise when displaying
     *            device trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This helps educe the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control costs by reducing the number of geofence
     *            evaluations.
     *            </p>
     *            </li>
     *            </ul>
     * @see PositionFiltering
     */
    public void setPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based
     * filtering can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This helps educe the effects of GPS noise when
     * displaying device trajectories on a map, and can help control costs by
     * reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and historical
     *            device positions to paginate through. Distance-based filtering
     *            can also reduce the effects of GPS noise when displaying
     *            device trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This helps educe the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control costs by reducing the number of geofence
     *            evaluations.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public UpdateTrackerRequest withPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
        return this;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based
     * filtering can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This helps educe the effects of GPS noise when
     * displaying device trajectories on a map, and can help control costs by
     * reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and historical
     *            device positions to paginate through. Distance-based filtering
     *            can also reduce the effects of GPS noise when displaying
     *            device trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This helps educe the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control costs by reducing the number of geofence
     *            evaluations.
     *            </p>
     *            </li>
     *            </ul>
     * @see PositionFiltering
     */
    public void setPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based
     * filtering can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This helps educe the effects of GPS noise when
     * displaying device trajectories on a map, and can help control costs by
     * reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and historical
     *            device positions to paginate through. Distance-based filtering
     *            can also reduce the effects of GPS noise when displaying
     *            device trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This helps educe the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control costs by reducing the number of geofence
     *            evaluations.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public UpdateTrackerRequest withPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
        return this;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     *
     * @return <p>
     *         Whether to enable position <code>UPDATE</code> events from this
     *         tracker to be sent to EventBridge.
     *         </p>
     *         <note>
     *         <p>
     *         You do not need enable this feature to get <code>ENTER</code> and
     *         <code>EXIT</code> events for geofences with this tracker. Those
     *         events are always sent to EventBridge.
     *         </p>
     *         </note>
     */
    public Boolean isEventBridgeEnabled() {
        return eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     *
     * @return <p>
     *         Whether to enable position <code>UPDATE</code> events from this
     *         tracker to be sent to EventBridge.
     *         </p>
     *         <note>
     *         <p>
     *         You do not need enable this feature to get <code>ENTER</code> and
     *         <code>EXIT</code> events for geofences with this tracker. Those
     *         events are always sent to EventBridge.
     *         </p>
     *         </note>
     */
    public Boolean getEventBridgeEnabled() {
        return eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     *
     * @param eventBridgeEnabled <p>
     *            Whether to enable position <code>UPDATE</code> events from
     *            this tracker to be sent to EventBridge.
     *            </p>
     *            <note>
     *            <p>
     *            You do not need enable this feature to get <code>ENTER</code>
     *            and <code>EXIT</code> events for geofences with this tracker.
     *            Those events are always sent to EventBridge.
     *            </p>
     *            </note>
     */
    public void setEventBridgeEnabled(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventBridgeEnabled <p>
     *            Whether to enable position <code>UPDATE</code> events from
     *            this tracker to be sent to EventBridge.
     *            </p>
     *            <note>
     *            <p>
     *            You do not need enable this feature to get <code>ENTER</code>
     *            and <code>EXIT</code> events for geofences with this tracker.
     *            Those events are always sent to EventBridge.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withEventBridgeEnabled(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = eventBridgeEnabled;
        return this;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     *
     * @return <p>
     *         Enables <code>GeospatialQueries</code> for a tracker that uses a
     *         <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *         >Amazon Web Services KMS customer managed key</a>.
     *         </p>
     *         <p>
     *         This parameter is only used if you are using a KMS customer
     *         managed key.
     *         </p>
     */
    public Boolean isKmsKeyEnableGeospatialQueries() {
        return kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     *
     * @return <p>
     *         Enables <code>GeospatialQueries</code> for a tracker that uses a
     *         <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *         >Amazon Web Services KMS customer managed key</a>.
     *         </p>
     *         <p>
     *         This parameter is only used if you are using a KMS customer
     *         managed key.
     *         </p>
     */
    public Boolean getKmsKeyEnableGeospatialQueries() {
        return kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     *
     * @param kmsKeyEnableGeospatialQueries <p>
     *            Enables <code>GeospatialQueries</code> for a tracker that uses
     *            a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >Amazon Web Services KMS customer managed key</a>.
     *            </p>
     *            <p>
     *            This parameter is only used if you are using a KMS customer
     *            managed key.
     *            </p>
     */
    public void setKmsKeyEnableGeospatialQueries(Boolean kmsKeyEnableGeospatialQueries) {
        this.kmsKeyEnableGeospatialQueries = kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyEnableGeospatialQueries <p>
     *            Enables <code>GeospatialQueries</code> for a tracker that uses
     *            a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >Amazon Web Services KMS customer managed key</a>.
     *            </p>
     *            <p>
     *            This parameter is only used if you are using a KMS customer
     *            managed key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withKmsKeyEnableGeospatialQueries(
            Boolean kmsKeyEnableGeospatialQueries) {
        this.kmsKeyEnableGeospatialQueries = kmsKeyEnableGeospatialQueries;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTrackerName() != null)
            sb.append("TrackerName: " + getTrackerName() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: " + getPricingPlanDataSource() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPositionFiltering() != null)
            sb.append("PositionFiltering: " + getPositionFiltering() + ",");
        if (getEventBridgeEnabled() != null)
            sb.append("EventBridgeEnabled: " + getEventBridgeEnabled() + ",");
        if (getKmsKeyEnableGeospatialQueries() != null)
            sb.append("KmsKeyEnableGeospatialQueries: " + getKmsKeyEnableGeospatialQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime
                * hashCode
                + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPositionFiltering() == null) ? 0 : getPositionFiltering().hashCode());
        hashCode = prime * hashCode
                + ((getEventBridgeEnabled() == null) ? 0 : getEventBridgeEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getKmsKeyEnableGeospatialQueries() == null) ? 0
                        : getKmsKeyEnableGeospatialQueries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrackerRequest == false)
            return false;
        UpdateTrackerRequest other = (UpdateTrackerRequest) obj;

        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getPricingPlanDataSource() == null ^ this.getPricingPlanDataSource() == null)
            return false;
        if (other.getPricingPlanDataSource() != null
                && other.getPricingPlanDataSource().equals(this.getPricingPlanDataSource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPositionFiltering() == null ^ this.getPositionFiltering() == null)
            return false;
        if (other.getPositionFiltering() != null
                && other.getPositionFiltering().equals(this.getPositionFiltering()) == false)
            return false;
        if (other.getEventBridgeEnabled() == null ^ this.getEventBridgeEnabled() == null)
            return false;
        if (other.getEventBridgeEnabled() != null
                && other.getEventBridgeEnabled().equals(this.getEventBridgeEnabled()) == false)
            return false;
        if (other.getKmsKeyEnableGeospatialQueries() == null
                ^ this.getKmsKeyEnableGeospatialQueries() == null)
            return false;
        if (other.getKmsKeyEnableGeospatialQueries() != null
                && other.getKmsKeyEnableGeospatialQueries().equals(
                        this.getKmsKeyEnableGeospatialQueries()) == false)
            return false;
        return true;
    }
}
