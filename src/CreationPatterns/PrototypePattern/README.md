## PROTOTYPE PATTERN

### Concept
- Used when you are trying to avoid costly creation
- Avoids subclassing
- Often utilise an interface
- Usually created with a Registry. The initial object is created and kept in the registry a clone is created from the registry

### Design
- Clone/Cloneable
- Avoids keyword "new"
- Although a copy each instance is unique
- Costly construction not handled by the client
- You can have a shallow copy(copies immediate properties) or deep copy(it will also copy any of the object reference)
