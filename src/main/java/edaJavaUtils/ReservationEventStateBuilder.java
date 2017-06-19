package edaJavaUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import OT.Messages.Reservation.Events.CRUD.*;


public class ReservationEventStateBuilder {
    String reservationType;
    ReservationStateType reservationState;
    LocalDateTime reservationDateTime;
    Instant reservationDateTimeUTC;
    int partySize;
    int seatedSize;
    int points;
    long restaurantID;
    long confirmationNumber;
    long GPID;
    boolean dinerIsAccountHolder;
    String creditCardLastFour;
    int partnerID;
    int reservationLanguageID;
    String reservationLanguageCode;
    long offerID;
    String notes;
    boolean isRestRef;
    boolean isLargeParty;
    ReservationDomain domain;
    int referrerID;
    String anonymousID;
    String securityToken;
    ReservationBilling billing;
    List<ReservationExtension> extensions;

    public ReservationEventStateBuilder() {
    }

    public ReservationEventStateBuilder reservationType(String reservationType) {
        this.reservationType = reservationType;
        return this;
    }

    public ReservationEventStateBuilder reservationState(ReservationStateType reservationState) {
        this.reservationState = reservationState;
        return this;
    }

    public ReservationEventStateBuilder reservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = LocalDateTime.from(reservationDateTime);
        return this;
    }

    public ReservationEventStateBuilder reservationDateTimeUTC(Instant reservationDateTimeUTC) {
        this.reservationDateTimeUTC = Instant.from(reservationDateTimeUTC);
        return this;
    }

    public ReservationEventStateBuilder partySize(int partySize) {
        this.partySize = partySize;
        return this;
    }

    public ReservationEventStateBuilder seatedSize(int seatedSize) {
        this.seatedSize = seatedSize;
        return this;
    }

    public ReservationEventStateBuilder points(int points) {
        this.points = points;
        return this;
    }

    public ReservationEventStateBuilder restaurantID(long restaurantID) {
        this.restaurantID = restaurantID;
        return this;
    }

    public ReservationEventStateBuilder confirmationNumber(long confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
        return this;
    }

    public ReservationEventStateBuilder GPID(Long GPID) {
        this.GPID = GPID;
        return this;
    }

    public ReservationEventStateBuilder dinerIsAccountHolder(boolean dinerIsAccountHolder) {
        this.dinerIsAccountHolder = dinerIsAccountHolder;
        return this;
    }

    public ReservationEventStateBuilder creditCardLastFour(String creditCardLastFour) {
        this.creditCardLastFour = creditCardLastFour;
        return this;
    }

    public ReservationEventStateBuilder partnerID(int partnerID) {
        this.partnerID = partnerID;
        return this;
    }

    public ReservationEventStateBuilder reservationLanguageID(int reservationLanguageID) {
        this.reservationLanguageID = reservationLanguageID;
        return this;
    }

    public ReservationEventStateBuilder reservationLanguageCode(String reservationLanguageCode) {
        this.reservationLanguageCode = reservationLanguageCode;
        return this;
    }

    public ReservationEventStateBuilder offerID(long offerID) {
        this.offerID = offerID;
        return this;
    }

    public ReservationEventStateBuilder notes(String notes) {
        this.notes = notes;
        return this;
    }

    public ReservationEventStateBuilder isRestRef(boolean isRestRef) {
        this.isRestRef = isRestRef;
        return this;
    }

    public ReservationEventStateBuilder isLargeParty(boolean isLargeParty) {
        this.isLargeParty = isLargeParty;
        return this;
    }

    public ReservationEventStateBuilder domain(ReservationDomain domain) {
        this.domain = domain;
        return this;
    }

    public ReservationEventStateBuilder referrerID(int referrerID) {
        this.referrerID = referrerID;
        return this;
    }

    public ReservationEventStateBuilder anonymousID(String anonymousID) {
        this.anonymousID = anonymousID;
        return this;
    }

    public ReservationEventStateBuilder securityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    public ReservationEventStateBuilder billing(ReservationBilling billing) {
        this.billing = billing;
        return this;
    }

    public ReservationEventStateBuilder extensions(List<ReservationExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    public ReservationEventStateBuilder extension(ReservationExtension extension) {
        if(this.extensions==null) {
            this.extensions = new ArrayList<>();
        }

        this.extensions.add(extension);
        return this;
    }

    public ReservationEventState build() {
        return new ReservationEventState(
            reservationType,
            reservationState,
            reservationDateTime,
            reservationDateTimeUTC,
            partySize,
            seatedSize,
            points,
            restaurantID,
            confirmationNumber,
            GPID,
            dinerIsAccountHolder,
            creditCardLastFour,
            partnerID,
            reservationLanguageID,
            reservationLanguageCode,
            offerID,
            notes,
            isRestRef,
            isLargeParty,
            domain,
            referrerID,
            anonymousID,
            securityToken,
            billing,
            extensions
        );
    }
}
