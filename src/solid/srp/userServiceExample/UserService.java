package solid.srp.userServiceExample;


public class UserService {

    private final ValidatorService validatorService;

    private final UserRepository userRepository;

    private final EmailService emailService;

    private final AuditService auditService;


    public UserService(ValidatorService validatorService, UserRepository userRepository, EmailService emailService, AuditService auditService) {
        this.validatorService = validatorService;
        this.userRepository = userRepository;
        this.emailService = emailService;
        this.auditService = auditService;
    }

    public void registerUser(User user) {
        validatorService.validate(user);
        userRepository.save(user);
        emailService.notifyUser(user);
        auditService.log(user);

    }
}
