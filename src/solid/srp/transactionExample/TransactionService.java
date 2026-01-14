package solid.srp.transactionExample;

public class TransactionService {

    private final TransactionValidator validator;
    private final TransactionRepository repository;
    private final NotificationService notificationService;
    private final AuditService auditService;

    public TransactionService(TransactionValidator validator, TransactionRepository repository, NotificationService notificationService, AuditService auditService) {
        this.validator = validator;
        this.repository = repository;
        this.notificationService = notificationService;
        this.auditService = auditService;
    }

    public void process(Transaction tx){

        validator.validate(tx);
        repository.save(tx);
        notificationService.notify(tx);
        auditService.log(tx);
    }
}
