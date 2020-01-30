package be.fgov.ehealth.recipe.protocol.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
   private static final QName _UploadFilePatientRequest_QNAME = new QName("urn:be:fgov:ehealth:recipe:protocol:v1", "UploadFilePatientRequest");
   private static final QName _UploadFilePrescriberResponse_QNAME = new QName("urn:be:fgov:ehealth:recipe:protocol:v1", "UploadFilePrescriberResponse");
   private static final QName _UploadFilePrescriberRequest_QNAME = new QName("urn:be:fgov:ehealth:recipe:protocol:v1", "UploadFilePrescriberRequest");
   private static final QName _UploadFileExecutorResponse_QNAME = new QName("urn:be:fgov:ehealth:recipe:protocol:v1", "UploadFileExecutorResponse");
   private static final QName _UploadFilePatientResponse_QNAME = new QName("urn:be:fgov:ehealth:recipe:protocol:v1", "UploadFilePatientResponse");
   private static final QName _UploadFileExecutorRequest_QNAME = new QName("urn:be:fgov:ehealth:recipe:protocol:v1", "UploadFileExecutorRequest");

   public GetPrescriptionForPatientResponse createGetPrescriptionForPatientResponse() {
      return new GetPrescriptionForPatientResponse();
   }

   public MarkAsArchivedRequest createMarkAsArchivedRequest() {
      return new MarkAsArchivedRequest();
   }

   public ListNotificationsResponse createListNotificationsResponse() {
      return new ListNotificationsResponse();
   }

   public ListFeedbacksRequest createListFeedbacksRequest() {
      return new ListFeedbacksRequest();
   }

   public CreateFeedbackRequest createCreateFeedbackRequest() {
      return new CreateFeedbackRequest();
   }

   public MarkAsUnDeliveredRequest createMarkAsUnDeliveredRequest() {
      return new MarkAsUnDeliveredRequest();
   }

   public SendNotificationRequest createSendNotificationRequest() {
      return new SendNotificationRequest();
   }

   public AliveCheckRequest createAliveCheckRequest() {
      return new AliveCheckRequest();
   }

   public UploadFileResponseType createUploadFileResponseType() {
      return new UploadFileResponseType();
   }

   public UpdatePatientFeedbackFlagResponse createUpdatePatientFeedbackFlagResponse() {
      return new UpdatePatientFeedbackFlagResponse();
   }

   public CreatePrescriptionResponse createCreatePrescriptionResponse() {
      return new CreatePrescriptionResponse();
   }

   public CreatePrescriptionRequest createCreatePrescriptionRequest() {
      return new CreatePrescriptionRequest();
   }

   public ListPatientPrescriptionsResponse createListPatientPrescriptionsResponse() {
      return new ListPatientPrescriptionsResponse();
   }

   public UpdateFeedbackFlagResponse createUpdateFeedbackFlagResponse() {
      return new UpdateFeedbackFlagResponse();
   }

   public GetPrescriptionForPrescriberRequest createGetPrescriptionForPrescriberRequest() {
      return new GetPrescriptionForPrescriberRequest();
   }

   public ListNotificationsRequest createListNotificationsRequest() {
      return new ListNotificationsRequest();
   }

   public MarkAsDeliveredRequest createMarkAsDeliveredRequest() {
      return new MarkAsDeliveredRequest();
   }

   public GetPrescriptionForExecutorRequest createGetPrescriptionForExecutorRequest() {
      return new GetPrescriptionForExecutorRequest();
   }

   public RevokePatientPrescriptionRequest createRevokePatientPrescriptionRequest() {
      return new RevokePatientPrescriptionRequest();
   }

   public RevokePrescriptionResponse createRevokePrescriptionResponse() {
      return new RevokePrescriptionResponse();
   }

   public MarkAsArchivedResponse createMarkAsArchivedResponse() {
      return new MarkAsArchivedResponse();
   }

   public ListFeedbacksResponse createListFeedbacksResponse() {
      return new ListFeedbacksResponse();
   }

   public SendNotificationResponse createSendNotificationResponse() {
      return new SendNotificationResponse();
   }

   public RevokePatientPrescriptionResponse createRevokePatientPrescriptionResponse() {
      return new RevokePatientPrescriptionResponse();
   }

   public ListOpenPrescriptionsResponse createListOpenPrescriptionsResponse() {
      return new ListOpenPrescriptionsResponse();
   }

   public ListPatientPrescriptionsRequest createListPatientPrescriptionsRequest() {
      return new ListPatientPrescriptionsRequest();
   }

   public ListOpenPrescriptionsRequest createListOpenPrescriptionsRequest() {
      return new ListOpenPrescriptionsRequest();
   }

   public RevokePrescriptionForExecutorRequest createRevokePrescriptionForExecutorRequest() {
      return new RevokePrescriptionForExecutorRequest();
   }

   public AliveCheckResponse createAliveCheckResponse() {
      return new AliveCheckResponse();
   }

   public UpdatePatientFeedbackFlagRequest createUpdatePatientFeedbackFlagRequest() {
      return new UpdatePatientFeedbackFlagRequest();
   }

   public GetPrescriptionForExecutorResponse createGetPrescriptionForExecutorResponse() {
      return new GetPrescriptionForExecutorResponse();
   }

   public UploadFileRequestType createUploadFileRequestType() {
      return new UploadFileRequestType();
   }

   public GetPrescriptionForPrescriberResponse createGetPrescriptionForPrescriberResponse() {
      return new GetPrescriptionForPrescriberResponse();
   }

   public MarkAsDeliveredResponse createMarkAsDeliveredResponse() {
      return new MarkAsDeliveredResponse();
   }

   public RevokePrescriptionRequest createRevokePrescriptionRequest() {
      return new RevokePrescriptionRequest();
   }

   public MarkAsUnDeliveredResponse createMarkAsUnDeliveredResponse() {
      return new MarkAsUnDeliveredResponse();
   }

   public GetPrescriptionForPatientRequest createGetPrescriptionForPatientRequest() {
      return new GetPrescriptionForPatientRequest();
   }

   public CreateFeedbackResponse createCreateFeedbackResponse() {
      return new CreateFeedbackResponse();
   }

   public UpdateFeedbackFlagRequest createUpdateFeedbackFlagRequest() {
      return new UpdateFeedbackFlagRequest();
   }

   public RevokePrescriptionForExecutorResponse createRevokePrescriptionForExecutorResponse() {
      return new RevokePrescriptionForExecutorResponse();
   }

   @XmlElementDecl(
      namespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      name = "UploadFilePatientRequest"
   )
   public JAXBElement<UploadFileRequestType> createUploadFilePatientRequest(UploadFileRequestType value) {
      return new JAXBElement(_UploadFilePatientRequest_QNAME, UploadFileRequestType.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      name = "UploadFilePrescriberResponse"
   )
   public JAXBElement<UploadFileResponseType> createUploadFilePrescriberResponse(UploadFileResponseType value) {
      return new JAXBElement(_UploadFilePrescriberResponse_QNAME, UploadFileResponseType.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      name = "UploadFilePrescriberRequest"
   )
   public JAXBElement<UploadFileRequestType> createUploadFilePrescriberRequest(UploadFileRequestType value) {
      return new JAXBElement(_UploadFilePrescriberRequest_QNAME, UploadFileRequestType.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      name = "UploadFileExecutorResponse"
   )
   public JAXBElement<UploadFileResponseType> createUploadFileExecutorResponse(UploadFileResponseType value) {
      return new JAXBElement(_UploadFileExecutorResponse_QNAME, UploadFileResponseType.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      name = "UploadFilePatientResponse"
   )
   public JAXBElement<UploadFileResponseType> createUploadFilePatientResponse(UploadFileResponseType value) {
      return new JAXBElement(_UploadFilePatientResponse_QNAME, UploadFileResponseType.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      name = "UploadFileExecutorRequest"
   )
   public JAXBElement<UploadFileRequestType> createUploadFileExecutorRequest(UploadFileRequestType value) {
      return new JAXBElement(_UploadFileExecutorRequest_QNAME, UploadFileRequestType.class, (Class)null, value);
   }
}
